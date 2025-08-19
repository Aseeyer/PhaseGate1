import unittest
import Task2

class TestGradeCalculator(unittest.TestCase):
    def test_that_returns_A_grade(self):
        result = Task2.get_average(95, 92, 90)
        self.assertEqual(result, 'A')

    def test_that_returns_B_grade(self):
        result = Task2.get_average(85, 80, 82)
        self.assertEqual(result, 'B')

    def test_that_returns_C_grade(self):
        result = Task2.get_average(72, 75, 70)
        self.assertEqual(result, 'C')

    def test_that_returns_F_grade(self):
        result = Task2.get_average(50, 55, 40)
        self.assertEqual(result, 'F')
