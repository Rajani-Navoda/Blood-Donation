import { Component, OnInit } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { UserService } from '../_services/user.service';
import { response } from 'express';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'] 
})

export class LoginComponent implements OnInit{

  
  constructor(private userService : UserService){}
  ngOnInit(): void {
    
  }
 

  login(loginForm:NgForm){
    console.log(loginForm);
   this.userService.login(loginForm.value).subscribe(
    (response)=>{
      console.log(response);
    },
    (error) => {
      console.log(error);
    }
   )
  }
}
