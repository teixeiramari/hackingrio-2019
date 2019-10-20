import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  clicou: boolean;
  redireciona: boolean;

  constructor() { }

  ngOnInit() {
  }

  clicked = false;

  actionMethod() {
    console.log("actionMethod was called!");
  }

  myFunction() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
  }

  myFunction2() {
    var popup = document.getElementById("myPopup2");
    popup.classList.toggle("show");
  }

  myFunction3() {
    var popup = document.getElementById("myPopup3");
    popup.classList.toggle("show");
  }

  myFunction4() {
    var popup = document.getElementById("myPopup4");
    popup.classList.toggle("show");
  }

  myFunction5() {
    var popup = document.getElementById("myPopup5");
    popup.classList.toggle("show");
  }

  myFunction6() {
    var popup = document.getElementById("myPopup6");
    popup.classList.toggle("show");
  }

  buscar(busca: string){
    if (busca == "vôlei"){
      this.redireciona = true;
    }
  }
}
