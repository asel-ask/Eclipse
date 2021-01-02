package assignments.assign_14.question12;

public class CameraPhone extends Phone{

	int imageSize,memorySize;

	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures () {
		return (memorySize*1000)/imageSize;
	}
	
	
}
