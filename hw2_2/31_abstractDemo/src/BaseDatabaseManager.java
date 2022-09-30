/*
 * Farklı veritabanı sistemiyle (oracla, mssql, mysql vs) çalışılabileceği için
 * ve bunun hangisi olduğunu bilmediğimiz için, abstract yapısıyla classları
 * oluşturup, kullanıcının hangi veritabanını kullanıyorsa ona ait sql sorgusu yazmasını
 * mümkün kılacağız.
 */

public abstract class BaseDatabaseManager {
	public abstract void getData();
	
	
}
