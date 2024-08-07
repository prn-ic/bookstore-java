import { ChangeDetectionStrategy, Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CardComponent {
  @Input() id = "0";
  @Input() name = "undefined";
  @Input() capacity = "0";
  @Input() imageUri = "https://sun1-97.userapi.com/s/v1/ig2/sJovpL1kvhen5m2IfnP68dBCyeqLNYotSLztLc2BCCCkho4rkXrN3UK2eG92xOjCKGbh51liAohqVfLn478xiutr.jpg?quality=95&as=32x23,48x34,72x51,108x77,160x114,240x170,360x256,480x341,540x383,640x454,720x511,1080x767,1280x908,1440x1022,2560x1817&from=bu&u=m8_Ce78YjPUOcU1_LWZUnM7cBTZJAZVuPF8WqyDX_sc&cs=604x429";
}
