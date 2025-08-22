import parking_space
import unittest

class TestFunctionParkCar(unittest.TestCase):
	def test_that_park_space_exist(self):
		parking_space.park_space(2)
	def test_that_park_space_take_incorrect_value(self):
		self.assertRaises(ValueError,parking_space.park_space,"Ade")
	def test_that_space_does_not_take_a_parking_spaces_greater_than_list_lengtht(self):
		self.assertRaises(ValueError,parking_space.park_space,20)
	def test_that_space_does_not_take_a_parking_space_of_negative_value(self):
		self.assertRaises(ValueError,parking_space.park_space,-1)
	def test_that_park_space_add_correct_value_and_return_correct_result(self):
		result = parking_space.park_space(10)
		self.assertEqual(result , "Car Added Succesfuly")
	def test_that_park_space_add_correct_value_and_return_correct_result_to_position_15(self):
		result = parking_space.park_space(15)
		self.assertEqual(result , "Car Added Succesfuly")

class TestFunctionRemoveCar(unittest.TestCase):
	def test_that_park_space_take_incorrect_value(self):
		self.assertRaises(ValueError,parking_space.park_space,"Cow")
	def test_that_remove_car_does_not_take_value_greater_than_the_length(self):
		self.assertRaises(ValueError,parking_space.park_space,20)
	def test_that_space_does_not_take_a_parking_space_of_negative_value(self):
		self.assertRaises(ValueError,parking_space.park_space,-1)
	def test_that_remove_car_return_correct_message_if_parking_space_is_empty_17(self):
		result = parking_space.remove_car(17)
		self.assertEqual(result, "The Space Is Empty")
	def test_that_remove_car_return_correct_message_if_parking_space_is_20(self):
		result = parking_space.remove_car(18)
		self.assertEqual(result, "The Space Is Empty")