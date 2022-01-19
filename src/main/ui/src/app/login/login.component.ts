import { Component, OnInit } from '@angular/core';
import {LoginService} from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loggedIn: boolean;
  username: string = '';
  password: string = '';

	constructor (private loginService: LoginService) {
    if(localStorage.getItem('UserHasLoggedIn') == '' || localStorage.getItem('UserHasLoggedIn') == null) {
      this.loggedIn = false;
    } else {
      this.loggedIn = true;
    }
  }
  
  onSubmit() {
  	this.loginService.sendCredential(this.username, this.password).subscribe({
        complete: () => {
        this.loggedIn=true;
        localStorage.setItem('UserHasLoggedIn', 'true');
        location.reload();
        },
      error : () => {console.log('Loggin Error')}
      });
  }

  ngOnInit() {}

}