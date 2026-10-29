package Exercise01;

public abstract class FormElement {
	int positionX;
	int positionY;
//Ein Konstruktur hier macht die Verberung leichter anstatt dass man die super methode nutzt
	public abstract void render();
}
