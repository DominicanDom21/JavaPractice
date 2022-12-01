import {Component, Input,Output, EventEmitter} from '@angular/core';

@Component({
    selector: 'mw-media-item',
    templateUrl: './media-item.component.html',
    styleUrls: ['./media-item.component.css']
})
export class ItemComponent{
    @Input() Item;
    
    @Output() this.delete = new EventEmitter;

    onDelete(){
        console.log('delete');
    }
}