import { createContext, useContext } from "react";

export let Context = createContext({
    todos:[
        {
            id: 1,
            todo: "Call Mahek",
            completed: false,
        }
    ],
    addTodo : (todo) => {},
    updateTodo: (id, todo)=>{},
    deleteTodo: (id)=>{},
    toggleComplete: (id)=>{}
})

export let useTodo = () => {
    return(
        useContext(Context)
    )
}

export let TodoProvider = Context.Provider