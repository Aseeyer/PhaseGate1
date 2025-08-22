import unittest
import Mini_Parking_System

class Test_Mini_Parking(unittest.TestCase):

    def setUp(self):
        Mini_Parking_System.reset_parking()

    def test_park_car(self):
        result = Mini_Parking_System.park_car()
        self.assertEqual("Your car has been parked at 1", result)
        self.assertEqual(1, Mini_Parking_System.getParking()[0])

    def test_parking_full(self):
        for _ in range(20):
            Mini_Parking_System.park_car()
        result = Mini_Parking_System.park_car()
        self.assertEqual("Sorry! Parking lot is full.", result)

    def test_remove_car(self):
        Mini_Parking_System.park_car()
        result = Mini_Parking_System.remove_car(1)
        self.assertEqual("Car removed from slot 1", result)
        self.assertEqual(0, Mini_Parking_System.getParking()[0])

    def test_invalid_remove(self):
        result = Mini_Parking_System.remove_car(25)
        self.assertEqual("Invalid slot number!", result)

