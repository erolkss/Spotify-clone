import { Component, effect, inject, OnInit } from '@angular/core';
import { FontAwesomeModule } from "@fortawesome/angular-fontawesome";
import { RouterModule } from "@angular/router";
@Component({
  selector: 'app-library',
  standalone: true,
  imports: [FontAwesomeModule, RouterModule],
  templateUrl: './library.component.html',
  styleUrl: './library.component.scss'
})
export class LibraryComponent {

}