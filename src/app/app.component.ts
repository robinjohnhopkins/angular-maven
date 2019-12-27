import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Demo';
  data = {};
  data2 = {};
  constructor(private http: HttpClient) {
    http.get('resource').subscribe(data => this.data = data);
    http.get('rude').subscribe(data => this.data2 = data);
  }
}
