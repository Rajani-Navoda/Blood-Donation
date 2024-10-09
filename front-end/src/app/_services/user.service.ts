import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Injector } from '@angular/core';


@Injectable({
  providedIn: 'root'
})


export class UserService {


  PATH_OF_API = "Http://localHost:9090";
  

  requestHeader = new HttpHeaders(
    {"No-Auth": "True"}
  );

  constructor(private httpClient: HttpClient) { }

  public login(loginData: any){
    return this.httpClient.post(this.PATH_OF_API +"/authenticate", loginData, {headers:this.requestHeader})
  }

  
}
