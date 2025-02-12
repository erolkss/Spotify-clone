import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@Component({
  selector: 'app-library',
  imports: [FontAwesomeModule, RouterModule],
  templateUrl: './library.component.html',
  styleUrl: './library.component.scss'
})
export class LibraryComponent {

}
