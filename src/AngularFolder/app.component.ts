import {component} from '@angular/core'

@Component({
    selector: 'mw-media-item',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

export class AppComponent{
     firstItem = {
        id: 1, 
        name: 'Firstbug',
        medium: 'Series',
        category: 'Science Fiction',
        year: 2010,
        watchedOn: 1294166565384,
        isFavorite: false

     };
}