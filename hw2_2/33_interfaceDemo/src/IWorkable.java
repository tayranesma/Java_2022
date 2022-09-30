/*
 * Senaryoda 2 tip çalışan var biri şirketin personeli diğeri firma personeli.
 * Şirket personeli ilgili şirketin personeli ama firma personeli, dışarıdan
 * outsource olarak çalıştırılan personel olsun.
 * Şirket personeline yemek ve maaş veriliyor, firma personeline bunlar
 * sağlanmıyor. Ortak işlemleri elbette var ama bazı işlemler/operasyonlar
 * her ikisinde de yok.
 * 
 */

public interface IWorkable {
	void work(); // çalışmaya yönelik operasyonlar olsun
	// mesaiye kalmak mesela
}
