package psa.naloga1;

public class Binarno {
	private NodeBinarno root;

	/*
	 * Metoda sprejme celo stevilo in ga vstavi v drevo. Ce element ze obstaja v drevesu, vrne false
	 * Metoda vrne true, ce je bil element uspesno vstavljen in false sicer.
	 */
	public boolean insert(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	/*
	 * Metoda sprejme celo stevilo in izbrise element iz drevesa. 
	 * Metoda vrne true, ce je bil element uspesno izbrisan iz drevesa, in false sicer
	 */
	public boolean delete(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	/*
	 * Metoda sprejme celo stevilo in poisce element v drevesu. 
	 * Metoda vrne true, ce je bil element uspesno najden v drevesu, in false sicer
	 */
	public boolean search(int element) {
		throw new UnsupportedOperationException("To funkcijo morate implementirati");
	}

	public int getCounter() {
		return root != null?root.getCounter():null;
	}
	
	public void resetCounter() {
		if(root!= null)
			root.resetCounter();
	}
}

