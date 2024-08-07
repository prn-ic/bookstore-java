import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-general-header',
  standalone: true,
  templateUrl: './general-header.component.html',
  styleUrl: './general-header.component.scss',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class GeneralHeaderComponent {

}
