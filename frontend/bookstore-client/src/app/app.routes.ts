import { Routes } from '@angular/router';
import { MainComponent } from '../pages/main/main.component';
import { CardDetailComponent } from '../pages/card-detail/card-detail.component';
import { CreateBookComponent } from '../pages/create-book/create-book.component';

export const routes: Routes = [
  {
    path: '',
    component: MainComponent
  },
  {
    path: 'card-detail/:id',
    component: CardDetailComponent
  },
  {
    path: 'create-book',
    component: CreateBookComponent
  }
];
