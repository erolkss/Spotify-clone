import { Component, effect, inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FaIconLibrary, FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NgbToast } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from "./layout/header/header.component";
import { fontAwesomeIcons } from './shared/font-awesome-icons';
import { NavigationComponent } from "./layout/navigation/navigation.component";
import { ToastService } from './service/toast.service';
import { LibraryComponent } from "./layout/library/library.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FontAwesomeModule, NgbToast, HeaderComponent, NavigationComponent, LibraryComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'spotify-clone-front';

  private faIconLibrary = inject(FaIconLibrary);

  toastService: ToastService = inject(ToastService);

  constructor() {
  }

  ngOnInit(): void {
    this.initFontAwesome();
  }

  private initFontAwesome() {
    this.faIconLibrary.addIcons(...fontAwesomeIcons);
  }

}
