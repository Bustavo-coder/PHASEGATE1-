def get_age_diffrence (fathers_age,son_age):
	if type(fathers_age) != int or type(son_age) != int:
		raise TypeError
	if fathers_age <= 0  or son_age <= 0:
		raise ValueError
	diffrence = 0
	if fathers_age >  2 * son_age:
		diffrence = fathers_age - 2 * son_age
	if fathers_age <  2 * son_age:
		diffrence =  2 * son_age - fathers_age
	return diffrence