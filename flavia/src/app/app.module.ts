import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
=======
import { ConsultaComponent } from './consulta/consulta.component';
import { TimeComponent } from './time/time.component';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
>>>>>>> 4c71c4cecc975ad408bcc37b43c7ec3565fbeb7a

@NgModule({
  declarations: [
    AppComponent,
    ConsultaComponent,
    TimeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

