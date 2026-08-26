package revisao;

public class VetorObjeto {
        public Object[] elementos;
        public int tamanho;

        public VetorObjeto(int capacidade) {
            this.elementos = new Object[capacidade];
            this.tamanho = 0;
        }

        public void adiciona(Object elemento) {
            this.aumentarCapacidade();
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

        public int tamanho() {
            return this.tamanho;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0; i < this.tamanho - 1; i++) {
                s.append(this.elementos[i]);
                s.append(", ");
            }

            if(this.tamanho > 0){
                s.append(this.elementos[this.tamanho -1]);
            }

            s.append("]");

            return s.toString();
        }

        public Object busca(int posicao) throws Exception {
            if (posicao >= 0 && posicao < tamanho) {
                return this.elementos[posicao];
            } else {
                throw new Exception("Posição inválida");
            }
        }

        public int busca1(String elemento) {
            for (int i = 0; i < tamanho; i++) {
                if (elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return -1;
        }

        public void aumentarCapacidade() {
            if (this.tamanho == this.elementos.length) {
                Object[] elementosNovos = new Object[this.elementos.length * 2];
                for (int i = 0; i < elementos.length; i++) {
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
            }
        }

    }


