import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private apiUrl = 'http://localhost:8080/api';  //TODO: Change this URL to Spring server URL later

  constructor(private http: HttpClient) { }

  // Example of a method that gets data from the Spring Boot API
  getData(): Observable<any> {
    return this.http.get(`${this.apiUrl}/data`);
  }

  // Example of a method that posts data to the Spring Boot API
  postData(data: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/data`, data);
  }
}
