import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BookService } from '../../services/books/book.service';
import { Book } from '../../models/book';

@Component({
  selector: 'app-card-detail',
  standalone: true,
  imports: [],
  templateUrl: './card-detail.component.html',
  styleUrl: './card-detail.component.scss',
})
export class CardDetailComponent {
  id: number;
  book: Book;

  constructor(
    private activateRoute: ActivatedRoute,
    private bookService: BookService
  ) {
    this.id = activateRoute.snapshot.params['id'];
    this.book = { id: this.id.toString(), name: 'undefined', pages: '0' };
    this.bookService.get(this.id).subscribe((x) => (this.book = x));
  }

  public delete() {
    this.bookService.delete(this.id);
  }
}
