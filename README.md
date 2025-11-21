# Padrão State

O **padrão State** é um padrão de projeto **comportamental** que tem como objetivo **permitir que um objeto altere seu comportamento dinamicamente** conforme o seu **estado interno muda**.  
Ele é útil quando um objeto possui **múltiplos estados possíveis** e as ações executadas devem **variar de acordo com o estado atual**, evitando o uso excessivo de condicionais (`if`/`switch`).

## Estrutura do projeto
- **Conta** → Classe principal que mantém uma referência para o estado atual e **delegará as operações** para ele.  
- **ContaEstado** → Interface que define as ações possíveis da conta (como sacar, depositar, transferir, encerrar, etc).  
- **ContaEstadoAtivada** → Estado que permite operações normais da conta.  
- **ContaEstadoBloqueada** → Estado em que a conta está bloqueada e **não permite movimentações**.  
- **ContaEstadoDepositado** → Estado após uma operação de **depósito**.  
- **ContaEstadoEncerrada** → Estado final da conta, onde **nenhuma ação é permitida**.  
- **ContaEstadoSacado** → Estado após uma operação de **saque**.  
- **ContaEstadoTransferido** → Estado após uma **transferência** realizada.

## Funcionamento
- A classe `Conta` mantém um atributo que representa o **estado atual** (`ContaEstado`).  
- Cada estado concreto (`ContaEstadoAtivada`, `ContaEstadoBloqueada`, etc.) **implementa os comportamentos específicos** daquele estado.  
- Quando uma ação é executada (como `depositar()` ou `sacar()`), a `Conta` **delegará a operação** para o estado atual.  
- O próprio estado pode **mudar o estado da conta** conforme a ação realizada, alterando o comportamento futuro dinamicamente.

## Quando usar State
- Quando um objeto precisa **mudar de comportamento em tempo de execução** dependendo do estado.  
- Quando há **muitos condicionais** que dependem do estado atual de um objeto.  
- Quando deseja **separar claramente** as regras e comportamentos de cada estado, tornando o código mais organizado e fácil de manter.

## Como usar este projeto
Clone o repositório:

```bash
git clone https://github.com/devjuliomartins/padrao-PedidoStatus.git
