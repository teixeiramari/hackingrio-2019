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


  click(){
    this.clicou = true;
  }

  close(){
    this.clicou = false;
  }

  buscar(busca: string){
    if (busca == "vôlei"){
      this.redireciona = true;
    }
  }
}
