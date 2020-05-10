

public class Question01 {

	public static void showImageCoords(int width, int height) {

		// complete

	}
	
	public static void showCartesianCoords(int width, int height) {

		// complete
		
	}

	public static void showWedge(int size, char c) {

		// complete

	}
	

	public static Picture duplicate(Picture image) {
		// method to copy an image
		
		
		int width = image.width();
		int height = image.height();
		
		Picture result = new Picture(width,height);
		
		
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
					
				// complete this step (to copy pixel from image to result)
	
			}
		}
		return result;
	}
	

	
	
	public static void main(String[] args) {
		


		
		showImageCoords(3, 4);
		System.out.println();
		
		showCartesianCoords(3, 4);
		System.out.println();
		
		showWedge(8, '#');
		System.out.println();
		
		
	}

}
