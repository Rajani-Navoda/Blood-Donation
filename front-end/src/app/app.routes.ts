import { Routes,RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { DonorComponent } from './donor/donor.component';
import { ForbiddenComponent } from './forbidden/forbidden.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:'home', component:HomeComponent},
    {path:'admin', component:AdminComponent},
    {path:'donor', component:DonorComponent},
    {path:'forbidden', component:ForbiddenComponent},
    {path:'login', component:LoginComponent}

];

