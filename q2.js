var str = prompt("enter a string");

function palindrome(str){
	var len = str.length;

	for(var i=0; i<len/2; i++){
		if(str.charAt(i) != str.charAt(len-i-1)){
			return false;
		}
	}
	return true;
}
console.log(palindrome(str));


function pal(str){
	var splitstring = str.split("");
	var reversestring = splitstring.reverse();
	var joinarray = reversestring.join("");

	if(str === joinarray)
		return true;
	else
		return false;
}
console.log(pal(str));
