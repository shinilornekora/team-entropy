export interface User {
    email: string,
    credentials: {[key: string]: string},
    licenses_key?: Array<string>,
    avatar?: string,
    isAdmin?: boolean,
}

export interface Product {
    name: string,
    releaseDate: Date,
    version: string,
    price: Number,
    pack: string,
    studentDiscounts?: boolean,
    specialDiscounts?: boolean,
}

export interface Payments {
    id: string
    recipient: User,
    sender: User,
    amount: Number,
}

export interface Message {
    text: string,
    sender: User,
    recipient: string,
    content: Array<string>,
    reputation: Number,
}

export interface Forum {
    topic: string,
    theme: string,
    messages: Array<Message>,
}