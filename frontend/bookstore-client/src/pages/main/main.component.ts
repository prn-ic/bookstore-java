import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';
import { CardComponent } from '../../components/card/card.component';
import { BookService } from '../../services/books/book.service';
import { Book } from '../../models/book';
import { concatMap } from 'rxjs';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [CardComponent, NgFor],
  templateUrl: './main.component.html',
  styleUrl: './main.component.scss',
})
export class MainComponent implements OnInit {
  bookList: Book[];
  constructor(private bookService: BookService) {
    this.bookList = [];
  }

  ngOnInit() {
    this.bookService.getBooks().subscribe((data: Book[]) => {
      this.bookList = data;
    });
  }
}
