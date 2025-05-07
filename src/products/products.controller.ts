import { Controller, Get, Req } from '@nestjs/common';
import { type Request } from 'express';

@Controller('api/products')
export class ProductsController {
  @Get()
  findAll(@Req() request: Request): string[] {
    return ["Product1", "Product2"];
  }
}