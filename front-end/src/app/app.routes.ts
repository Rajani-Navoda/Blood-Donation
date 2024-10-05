import { Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { DonorComponent } from './donor/donor.component';
import { OrganizerComponent } from './organizer/organizer.component';
import { BloodBankComponent } from './blood-bank/blood-bank.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:'', component:HomePageComponent},
    {path:'home', component:HomePageComponent},
    {path:'donor', component:DonorComponent},
    {path:'oranizer', component:OrganizerComponent},
    {path:'blood-bank',component:BloodBankComponent},
    {path: 'admin', component: AdminComponent},
    {path: 'login', component:LoginComponent} 
];
