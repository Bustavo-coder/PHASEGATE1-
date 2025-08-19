def get_grade(scores_list):
	if type(scores_list) != list or all(type(element) == str for element in scores_list ):
		raise TypeError
	average = sum(scores_list) / len(scores_list)
	if average >= 90 and average <= 100: return 'A'
	if average >= 80 and average < 90: return 'B'
	if average >= 70 and average < 80: return 'C'
	if average >= 60 and average < 70: return 'D'
	if average >= 0 and average < 60: return 'E'

	