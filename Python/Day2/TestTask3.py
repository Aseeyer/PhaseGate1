import unittest
import Task3 

class TestTask3(unittest.TestCase):
    def test_no_one_likes_this(self):
        result = Task3.get_likes([])
        self.assertEqual(result, "no one likes this")

    def test_single_person_likes_this(self):
        result = Task3.get_likes(["Peter"])
        self.assertEqual(result, "Peter likes this")

    def test_two_people_like_this(self):
        result = Task3.get_likes(["Jacob", "Alex"])
        self.assertEqual(result, "Jacob and Alex like this")

    def test_more_than_three_people_like_this(self):
        result = Task3.get_likes(["Alex", "Jacob", "Mark", "Max"])
        self.assertEqual(result, "Alex, Jacob and 2 others like this")