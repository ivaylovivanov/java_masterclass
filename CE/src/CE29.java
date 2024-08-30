public class CE29 {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(areaPerBucket <= 0 || width <= 0 || height <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        double bucketsNeeded = area / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(areaPerBucket <= 0 || area <= 0){
            return -1;
        }

        double bucketsNeeded = area / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }
}
