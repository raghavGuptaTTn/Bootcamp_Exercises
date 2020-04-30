import {SinglyLinkedList} from './ans11';

class Stack {

    constructor() { 
        this.list = new SinglyLinkedList(); 
        this.top = -1; 
    }
    push(x) {
        this.list.addLast(x);
        this.top += 1;
    }
    pop() {
        if(this.isEmpty() == false){
            this.list.removeLast();
            this.top -= 1;
        }
    }
    front() {
        if(this.isEmpty() == false)
            return this.list.getFirst();
    }

    printList() { 
        this.list.printList();
    } 
    
    isEmpty(){
        return this.top == -1;
    }

}

export {Stack};