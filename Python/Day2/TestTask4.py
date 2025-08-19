import unittest
import Task4

class TestTask4(unittest.TestCase):
    def test_enough_fuel_exact_distance(self):
        result = Task4.is_possible_or_not(50, 25, 2)
        self.assertTrue(result)

    def test_not_enough_fuel(self):
        result = Task4.is_possible_or_not(100, 25, 2)
        self.assertFalse(result)

    def test_more_than_enough_fuel(self):
        result = Task4.is_possible_or_not(40, 25, 2)
        self.assertTrue(result)

    def test_zero_fuel(self):
        result = Task4.is_possible_or_not(10, 25, 0)
        self.assertFalse(result)