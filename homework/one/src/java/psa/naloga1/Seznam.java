package psa.naloga1;

public class Seznam {
	private NodeSeznam head;


	/*
	 * Metoda sprejme celo stevilo in ga vstavi v seznam. Ce element ze obstaja v seznamu, vrne false
	 * Metoda vrne true, ce je bil element uspesno vstavljen in false sicer.
	 */
	public boolean insert(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	/*
	 * Metoda sprejme celo stevilo in izbrise element iz seznama. 
	 * Metoda vrne true, ce je bil element uspesno izbrisan iz seznama, in false sicer
	 */
	public boolean delete(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	/*
	 * Metoda sprejme celo stevilo in poisce element v seznamu. 
	 * Metoda vrne true, ce je bil element uspesno najden v seznamu, in false sicer
	 */
	public boolean search(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}
	
	public int getCounter() {
		return head != null?head.getCounter():null;
	}
	
	public void resetCounter() {
		if(head!= null)
			head.resetCounter();
	}
}
