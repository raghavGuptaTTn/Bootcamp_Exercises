import {uniqueArray} from './ans4B';
import {flattenToSingleLevel} from './ans10';
import {allCombinations} from './ans5';
import {result} from './ans3';
import {Pug} from './ans6';
import {areaOfCircle,areaOfRectangle,areaOfCylinder} from './ans8';
import {SinglyLinkedList} from './ans11';
import {Stack} from './ans13'
import {SetClass,customMap,customSet} from './ans12';
import {Calculator} from './Calculator';

// ans 1
console.log("--------- answer 1 ---------");

let givenArray = [3,62,234,7,23,74,23,76,92];
let filteredArray = givenArray.filter(n=>n>70);
console.log(filteredArray);

// ans 2(a)
console.log("--------- answer 2A ---------");

let liArray = Array.from(document.getElementsByTagName('li'));
console.log(liArray);
 
// 2(b)
console.log("--------- answer 2B ---------");

let onlyFlexBox = liArray.filter((li) => {
    if(li.innerHTML.includes('Flexbox')) {
        return li;
    }
});
console.log(onlyFlexBox);


// ans 2(c) 
console.log("--------- answer 2C ---------");

let timeStrings = onlyFlexBox.map((li) => li.dataset.time);
console.log(timeStrings);


// ans 2(d)
console.log("--------- answer 2D ---------");

let arrayOfSeconds = timeStrings.map((li) => li.split(":").pop(-1));
console.log(arrayOfSeconds);


// ans 2(e)
console.log("--------- answer 2E ---------");

//filter using reduce
const totalUsingFilter = arrayOfSeconds
    .filter(arr => parseInt(arr) > 30)
    .reduce((total,arr) => {
        return total+parseInt(arr);
    },0);
console.log(`total using filter ${totalUsingFilter}`);

//filter without using reduce
let total = 0;
arrayOfSeconds
    .filter(arr => {
        if(parseInt(arr) > 30) {
            total+=parseInt(arr);
        }
    });
console.log(total);
 

// total with map
let totalMap = 0;
arrayOfSeconds
    .map(arr=> {
        if(parseInt(arr) >30) {
            totalMap += parseInt(arr);
        }
    });
console.log(totalMap);



// ans3 - in separate file - run using node. 
console.log("--------- answer 3 ---------");

console.log(result);


// ans4A - in separate file - run using node. 

// ans 4B -> Filter unique array members using Set.
console.log("--------- answer 4B ---------");

console.log(uniqueArray([1,1,2,3,4,4,4]));


// ans 5 ->  Find the possible combinations of a string and store them in a MAP? 
console.log("--------- answer 5 ---------");

let strings = allCombinations("abc");
let map = new Map();
for (let i=0;i<strings.length;i++) {
    map.set(i,strings[i]);
}
for (let [key, value] of map.entries()) {
      console.log(`${key} => ${value}`);
}


// ans 6 -> . Write a program to implement inheritance upto 3 classes.The Class must have public letiables and static functions.
console.log("--------- answer 6 ---------");

let pug = new Pug("doggie","pug",2);
console.log(pug);
Pug.show();

// ans 7 ->  separate file - run by node. 
console.log("--------- answer 7 ---------");

console.log(Calculator.add(2,3));
console.log(Calculator.subtract(2,3));
console.log(Calculator.multiply(2,3));
console.log(Calculator.modulus(2,3));

// ans 8 -> Import a module containing the constants and method for calculating area of circle, rectangle, cylinder.
console.log("--------- answer 8 ---------");

console.log("area of circle " + areaOfCircle(2.5));
console.log("area of rectangle " + areaOfRectangle(4,5));
console.log("area of cylinder " + areaOfCylinder(20,3.5));
  

// ans 9
console.log("--------- answer 9 ---------");

console.log(uniqueArray([1,1,2,3,4,4,4]));

// ans 10 -> run separately using node. 
console.log("--------- answer 10 ---------");
let arr = [[1,2],[3,4,5,[4,5,6,67,[7,8,54]],6],10,77,43,26,100];

console.log(flattenToSingleLevel(arr));


// ans 11 -> Implement a singly linked list in es6 and implement addFirst(), addLast(), length(), getFirst(), getLast(). (without using array)
console.log("--------- answer 11 ---------");
let singleList = new SinglyLinkedList();
singleList.addFirst(20);
singleList.addLast(30);
console.log("list");
singleList.printList();
singleList.addFirst(10);
console.log("list");
singleList.printList();
console.log(singleList.getFirst());
console.log(singleList.getLast());
console.log(singleList.getLength());


// ans 12
console.log("--------- answer 12 ---------");
console.log("-- MAP --");

let myMap = new customMap();

myMap.add("one",1);
myMap.add("two",2);
myMap.add("three",3);
myMap.add("four",4);
console.log(myMap);

myMap.remove("two");
console.log(myMap);

console.log(myMap.get("one"));

console.log("-- SET --");
let mySet = new customSet();
mySet.add(2);
mySet.add(4);
mySet.add(4);
mySet.remove(2);
console.log(mySet.contains(4));
console.log(mySet);


// ans 13 -> stack using linked list
console.log("--------- answer 13 ---------");

let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);
console.log("front - " + stack.front());
stack.printList();
stack.pop();
console.log("front - " + stack.front());
stack.printList();
stack.pop();
stack.pop();
stack.pop();
console.log("front - " + stack.front());
stack.printList();
stack.pop();






  
