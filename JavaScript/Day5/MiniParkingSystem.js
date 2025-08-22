const prompt = require("prompt-sync")

let parking = new Array(20).fill(0);

function showStatus() {
  console.log("\nParking Lot Status:");
  console.log(parking.join(" "));
}

function parkCar() {
  let parked = false;
  for (let i = 0; i < parking.length; i++) {
    if (parking[i] === 0) {
      parking[i] = 1;
      console.log("Car parked at slot " + (i + 1));
      parked = true;
      break;
    }
  }
  if (!parked) {
    console.log("Sorry! Parking lot is full.");
  }
}

function removeCar() {
  let slot = parseInt(prompt("Enter slot number to remove car (1-20): "));
  if (slot >= 1 && slot <= 20) {
    if (parking[slot - 1] === 1) {
      parking[slot - 1] = 0;
      console.log("Car removed from slot " + slot);
    } else {
      console.log("Slot " + slot + " is already empty.");
    }
  } else {
    console.log("Invalid slot number!");
  }
}



let choice;
do {
  console.log("\n--- Mini Parking System ---");
  console.log("1. Park a car");
  console.log("2. Remove a car");
  console.log("3. Show parking status");
  console.log("0. Exit");

  choice = prompt("Enter your choice: ");

  switch (choice) {
    case "1":
      parkCar();
      break;
    case "2":
      removeCar();
      break;
    case "3":
      showStatus();
      break;
    case "0":
      console.log("Exiting... Goodbye!");
      break;
    default:
      console.log("Invalid choice! Try again.");
  }
} while (choice !== "0");
