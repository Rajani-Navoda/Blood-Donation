import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatTabsModule } from '@angular/material/tabs';
import { trigger, state, style, animate, transition } from '@angular/animations';
import { RouterModule } from '@angular/router';



@Component({
  selector: 'app-nav-bar',
  standalone: true,
  animations: [
    trigger('collapseExpand', [
      state('collapsed', style({
        height: '0px',
        opacity: 0,
        overflow: 'hidden'
      })),
      state('expanded', style({
        height: '*',
        opacity: 1
      })),
      transition('collapsed <=> expanded', [
        animate('0.5s ease-in-out')
      ])
    ])
  ],
  imports: [ CommonModule, RouterModule, MatTabsModule],
  templateUrl: './nav-bar.component.html',
  styleUrl: './nav-bar.component.css'
})
export class NavBarComponent {

  isCollapsed = true; // Keeps track of the collapse state
 
  toggleCollapse() {
    this.isCollapsed = !this.isCollapsed; // Toggles the collapse state
 
  }

}
