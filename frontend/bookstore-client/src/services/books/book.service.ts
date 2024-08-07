import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Book } from '../../models/book';
import { ResponseModel } from '../../models/responseModel';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  constructor(private httpClient: HttpClient) {}

  public getBooks(): Observable<Book[]> {
    let url = environment.apiUrl;
    return this.httpClient.get<ResponseModel<Book[]>>(url + '/get').pipe(
      map((x) => {
        return x.data;
      })
    );
  }

  public get(id: number): Observable<Book> {
    let url = environment.apiUrl;
    return this.httpClient
      .get<ResponseModel<Book>>(url + '/get/?id=' + id)
      .pipe(map((x) => x.data));
  }

  public delete(id: number): void {
    let url = environment.apiUrl;
    this.httpClient
      .delete(url + '?id=' + id)
      .subscribe((x) => (window.location.href = '/'));
  }

  public create(book: Book): void {
    let url = environment.apiUrl;
    this.httpClient
      .post(url, book)
      .subscribe((x) => (window.location.href = '/'));
  }
}
