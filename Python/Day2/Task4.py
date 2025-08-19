def is_possible_or_not(distanceToPump, milesPerGallon, gallonsLeft):
    return milesPerGallon * gallonsLeft >= distanceToPump



print(isPossibleOrNot(50, 25, 2))
print(isPossibleOrNot(500, 25, 2))
print(isPossibleOrNot(500, 25, 30))




    