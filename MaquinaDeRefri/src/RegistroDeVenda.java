public class RegistroDeVenda {

        private double valor;
        private Maquina pedido = new Maquina();
        
        public RegistroDeVenda(){
            valor=0;
        }
    
        public String setOpcaoDeEscolha(int escolha){
            String validar;
            if(valor>0){
                if(pedido.getProduto(escolha)){
                    valor = valor - pedido.getValorDoProduto(escolha);
                    pedido.setSaldo(pedido.getValorDoProduto(escolha));
                    pedido.setProduto(escolha);
                    validar = "Retire seu produto";
                    return validar;
                }
                else{
                    return validar = "Não tem mais produto";
                }
            }
            else{
                return validar = "Insira um valor";
            }
        }
        
        public void setInserirMaisValor(double maisValor){
            valor = maisValor;
        }
        
        
        public double getPegarTroco(){
            return valor;
        }
        
        public double getPegarSaldo(){
            return valor;
        }


}
