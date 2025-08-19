//You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your cars runs on about 25 miles per gallon. There are 2 gallons left. Considering these factors, write a function that tells you if it is possible to get to the pump or not. Function should return true if it is possible and false if not.


function isPossibleOrNot(distanceToPump, milesPerGallon, gallonsLeft) {
    return milesPerGallon * gallonsLeft >= distanceToPump;
}

console.log(isPossibleOrNot(50, 25, 2));
console.log(isPossibleOrNot(100, 25, 2)); 
console.log(isPossibleOrNot(200, 50, 3));


