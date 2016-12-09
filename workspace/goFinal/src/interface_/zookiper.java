package interface_;
public class zookiper {
public void feed(predater predater){
	System.out.println("feed "+predater.getName());
}
public static void main(String[] args) {
	tiger tiger = new tiger();
	tiger.setName("tiger");
	lion lion = new lion();
	lion.setName("lion");
	zookiper zookiper = new zookiper();
	zookiper.feed(tiger);
	zookiper.feed(lion);
}
}
