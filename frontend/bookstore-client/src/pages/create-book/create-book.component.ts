import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  FormsModule,
  ReactiveFormsModule,
} from '@angular/forms';
import { Book } from '../../models/book';
import { BookService } from '../../services/books/book.service';

@Component({
  selector: 'app-create-book',
  standalone: true,
  imports: [FormsModule, ReactiveFormsModule],
  templateUrl: './create-book.component.html',
  styleUrl: './create-book.component.scss',
})
export class CreateBookComponent {
  bookForm: FormGroup = new FormGroup({
    name: new FormControl(),
    pages: new FormControl(),
  });

  book: Book | undefined;

  constructor(private bookService: BookService) {}

  submit() {
    this.book = {
      id: '0',
      name: this.bookForm.value.name,
      pages: this.bookForm.value.pages,
    };

    this.bookService.create(this.book);
  }
}
