package br.digitaleducation.listaencadeadas;

public class ListaEncadeada<T> {

    No<T> refnoEntrada;

    public ListaEncadeada() {
        this.refnoEntrada = null;
    }

    // METODO PARA PODER ADICIONAR NO
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            refnoEntrada = novoNo;
            return;
        }
    No<T> noAuxiliar = refnoEntrada;
        for (int i = 0; i < this.size()-1; i++ ){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){

    return getNo(index).getConteudo();

    }

    private No<T> getNo(int index){
        validaIndice(index);

        No<T> noAuxiliar = refnoEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i < this.size()-1; i++ ){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(noRetorno);

        return noRetorno;
    }

    // METODO PARA PODER ME DIZER O TAMANHO DO MEU NO
    public int size(){
        int tamanholista = 0;
        No<T> referenciaAux = refnoEntrada;
        while (true){
            if (referenciaAux!=null){
                tamanholista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanholista;
    }

    //METODO PARA REMOVER NÓ;
    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if (index==0){
            refnoEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }


    //METODO DE VALIDAÇÃO DE INDEX
    private void validaIndice(int index){
        if (index>=size()){
            int ultimoindice = size() -1;
            throw new IndexOutOfBoundsException("NÃO EXISTE CONTEÚDO NO INDICE " + index + "Desta lista. Esta lista só vai até o indice " + ultimoindice );
        }
    }

    // METODO PARA VER SE NÃO ESTA VAZIO O NO;
    public boolean isEmpty(){
        if(refnoEntrada==null){
            return true;
        }
        else {
            return false;
        }
    }

    // METODO PARA PODERMOS IMPRIMIR
    public String toString(){
        String stringretorno = "";
        No<T> noAuxiliar = refnoEntrada;
        for (int i = 0; i < this.size(); i++){
            stringretorno += "No{conteudo= " + noAuxiliar.getConteudo() + "}---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringretorno += "null";
        return stringretorno;
    }
}
