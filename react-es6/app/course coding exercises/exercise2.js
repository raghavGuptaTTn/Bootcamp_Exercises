/*
  ##Coding Exercise: Show Me the Evens - Show me the Odds

Diana is learning to count and she just learned the difference between odds and even numbers. She wants to have some fun, so she picks a random number. If that number is even, she decides to count all the even numbers up to it. If not, she decides to count all the odd numbers up to that number.

Directions Fix this count function to return all even numbers starting from 0 up to (but not including) the input. Likewise, it the input is odd, return all odd numbers starting from 1 (but not including) the input.
*/

function count(x) {
    var numbers = [];
    if (x % 2 == 0) {
      for (var i=0; i<x; i += 2) {
        numbers.push(i);
      }
    } else {
      for (var i=1; i<x; i += 2) {
        numbers.push(i);
      }
    }
    return numbers;
}

console.log(count(11));
console.log(count(22));
