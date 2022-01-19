import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http'
import {HttpClient} from '@angular/common/http'
import { AppRoutingModule }  from './app-routing.module';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';

import { LoginService } from './login.service';
import { UserService } from './user.service';
import { TransactionComponent } from './transaction/transaction.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    TransactionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    HttpClient,
    AppRoutingModule
  ],
  providers: [
    LoginService,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }