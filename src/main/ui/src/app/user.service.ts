import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'


@Injectable()
export class UserService {

  constructor (private http:HttpClient){}

   getTransactionList(username: string) {
     let url = "http://localhost:8080/api/transaction?username="+username;
    return this.http.get(url, { withCredentials: true });
   }

}