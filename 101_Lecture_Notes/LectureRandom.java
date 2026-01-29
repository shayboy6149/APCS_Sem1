/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        double x = Math.random()*(75-30) + 30;
        double y = Math.random()*(160-80) + 80;
        System.out.println((int)(Math.random()*(y-x)+x));
	}
}
